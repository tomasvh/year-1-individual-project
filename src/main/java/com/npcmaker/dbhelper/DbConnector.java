package com.npcmaker.dbhelper;

import java.io.*;
import java.sql.*;

        public class DbConnector {
            public Connection connect() {
                String d = System.getProperty("user.home");
                String dbDir = d + File.separator + "NPCmaker" + File.separator;
                File f = new File(dbDir);
                if (!f.exists()){
                    f.mkdir();
                }
                String dbName = "npcmakerdb.accdb";
                String dbPath = dbDir + dbName;
                File f2 = new File(dbPath);
                if (!f2.exists()){
                    try {
                        try (
                                InputStream in = DbConnector.class.getResourceAsStream("/db/" + dbName);
                                OutputStream out = new BufferedOutputStream(new FileOutputStream(f2))) {

                            byte[] buffer = new byte[1024];
                            int lengthRead;
                            while ((lengthRead = in.read(buffer)) > 0) {
                                out.write(buffer, 0, lengthRead);
                                out.flush();
                            }
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

                String dbUrl = "jdbc:ucanaccess://" + dbPath;
                Connection conn;
                ResultSet rs;
                Statement s;

                try {
                    conn = DriverManager.getConnection(dbUrl,"","");
                    return conn;
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                return null;
            }
        }








