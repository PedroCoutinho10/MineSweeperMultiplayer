package edu.ufp.sd.sdminesweeper.server;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <p>
 * Title: Distributed Systems Project - BoulderDash</p>
 * <p>
 * Description: BoulderDash Game Multiplayer - Distributed using RMI</p>
 * <p>
 * Copyright: Copyright (c) 2017</p>
 * <p>
 * Company: UFP </p>
 *
 * @author Tiago Cardoso <tiagocardosoweb@gmail.com>
 * @author Miguel Ferreira <migueelfsf@gmail.com>
 * @version 0.1
 */
public class State implements Serializable {

    public class Message implements Serializable {

        private String username;
        private String message;
        private Date time;

        public Message(String username, String message, Date time) {
            this.username = username;
            this.message = message;
            this.time = time;
        }

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public Date getTime() {
            return time;
        }

        public String getDateTimeFormatted() {
            DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
            return df.format(this.time);
        }

        public String getOnlyTimeFormatted() {
            DateFormat df = new SimpleDateFormat("HH:mm:ss");
            return df.format(this.time);
        }

        public void setTime(Date time) {
            this.time = time;
        }
    }

    public class ConnectedClients implements Serializable {

        private int clients;

        public ConnectedClients(int clients) {
            this.clients = clients;
        }

        public int getClients() {
            return clients;
        }

        public void setClients(int clients) {
            this.clients = clients;
        }

    }

    public class Disconnect implements Serializable {

        private int type;
        private String message;

        public Disconnect(int type, String message) {
            this.type = type;
            this.message = message;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    public class NewRoom implements Serializable {

        private boolean removeAll;
        private String roomName;

        public NewRoom(boolean removeAll, String roomName) {
            this.removeAll = removeAll;
            this.roomName = roomName;
        }

        public String getRoomName() {
            return roomName;
        }

        public boolean isRemoveAll() {
            return removeAll;
        }
    }
    
    public class GenericState implements Serializable {
        private String type;
        
        public GenericState(String type) {
            this.type = type;
        }
        
        public String getType() {
            return this.type;
        }
    }
}
