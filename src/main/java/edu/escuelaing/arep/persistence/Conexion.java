package edu.escuelaing.arep.persistence;



import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.ServerApi;
import com.mongodb.ServerApiVersion;
import com.mongodb.client.*;
import edu.escuelaing.arep.model.Registro;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Date;

public class Conexion {

    private MongoClient CLIENT;


    public Conexion() {

        ConnectionString connection = new ConnectionString("mongodb+srv://juank2121:juan133812@roundrobin.chjar8r.mongodb.net/?retryWrites=true&w=majority");
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(connection)
                .serverApi(ServerApi.builder()
                        .version(ServerApiVersion.V1)
                        .build())
                .build();
        CLIENT = MongoClients.create(settings);
        MongoDatabase database = CLIENT.getDatabase("test");


    }

    public void insertar(Registro registro) {
        MongoDatabase db = CLIENT.getDatabase("Bd-RoundRobin");
        MongoCollection<Document> registroMongoCollection = db.getCollection("Bd-RoundRobin");
        Document documentos = new Document();
        documentos.put("detalle", registro.getDetalle());
        documentos.put("fecha", registro.getFecha());
        registroMongoCollection.insertOne(documentos);

    }
    // traer los ultimos 10 datos que esten en la coleccion
    public ArrayList<Registro> buscar (){
        MongoDatabase db = CLIENT.getDatabase("Bd-RoundRobin");
        MongoCollection<Document> registroMongoCollection = db.getCollection("Bd-RoundRobin");
        FindIterable BUSCAR = registroMongoCollection.find();
        ArrayList<Document> documentos = new ArrayList<Document>();
        ArrayList<Registro> registros = new ArrayList<Registro>();
        BUSCAR.into(documentos);
        
        for(int i = documentos.size()-1;i>=documentos.size()-10;i--){
            if(documentos.get(i).get("detalle")!=null && documentos.get(i).get("fecha")!=null){
                registros.add(new Registro((String)documentos.get(i).get("detalle"),(Date)documentos.get(i).get("fecha")));
            }
        }
        return registros;

    }
}


