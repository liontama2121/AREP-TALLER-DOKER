package edu.escuelaing.arep.persistence;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import edu.escuelaing.arep.model.Registro;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Date;

public class Conexion {
    private MongoClientURI URI;
    private MongoClient CLIENT;


    public Conexion() {
        URI = new MongoClientURI("mongodb+srv://juank2121:juan133812@roundrobin.chjar8r.mongodb.net/?retryWrites=true&w=majority");
        CLIENT = new MongoClient(URI);


    }

    public void insertar(Registro registro) {
        CLIENT = new MongoClient(URI);
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


