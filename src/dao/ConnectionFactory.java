/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
faz a conexão com o banco de dados
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author admin.elisson
 */

//classe de conexão que poderia ser Modulo de conexão //
public class ConnectionFactory {
    //(Conection) metodo responsavel por estabelecer a conexão com o banco// 
    public static Connection conector(){
           
        java.sql.Connection conexao = null;
            // a linha abaixo chama io driver
        String driver = "com.mysql.jdbc.Driver";
        //armazenando informaçoes referentes ao banco//
        String url="jdbc:mysql://localhost:3306/greemloc";
        String user="root";
        String password="";
        //estabelecer conexao com banco//
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,password);
            return conexao;
        }catch(Exception e) {
           return null; 
        }
        
    }

}
