package edu.escuelaing.arep;

import com.google.gson.Gson;
import edu.escuelaing.arep.model.Registro;
import edu.escuelaing.arep.persistence.Conexion;

import static spark.Spark.*;


public class App {
    public
    static void main(String[] args) {
        port(getPort());
        Conexion connection = new Conexion();
        get("/buscar", (req,
                         res) -> {
            res.status(200);
            res.type("application/json");
            return
                    new
                            Gson().toJson(connection.buscar());
        });
        post("/insertar", (req,
                          res) -> {
            System.out.println(req + " "+res);
                    Registro a = new Registro(req.body());
            connection.insertar(a);
            return null;
        });
    }

    static int
    getPort() {
        if (System.getenv("PORT")
                != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4568;

    }
}
