package ru.innopolis.problem1;

import java.util.ArrayList;

// your solution here
//fix all the errors including package errors
class Logger{
    Handler firstHandler;

    public static void main(String[] args) {
        Logs l = new Logs(); l.addLog("admin deleted his OS");
        Logger logger = new Logger();
        logToFile lf = new logToFile();
        logToConsole lc = new logToConsole();
        logToServer ls = new logToServer();
        logger.firstHandler.setNext(lf);
        lf.setNext(lc);
        lc.setNext(ls);
        logger.firstHandler.handle(l);
    }
}
class Logs{
    public ArrayList<String> logs;

    public Logs(ArrayList<String> logs) {
        this.logs = logs;
    }
    public Logs(){
        logs = new ArrayList<>();
    }
    public void addLog(String l){
        logs.add(l);
    }
}
interface Handler{
    void setNext(Handler h);
    void handle(Logs logs);
}

class logToFile implements Handler{
    public Handler next;

    @Override
    public void setNext(Handler h) {
        next = h;
    }

    @Override
    public void handle(Logs logs) {
        // logs to file
        if(next!= null)
        next.handle(logs);
    }
}
class logToConsole implements Handler{
    public Handler next;

    @Override
    public void setNext(Handler h) {
        next = h;
    }

    @Override
    public void handle(Logs logs) {
        // logs to console
        if(next!= null)
        next.handle(logs);
    }
}
class logToServer implements Handler{
    public Handler next;

    @Override
    public void setNext(Handler h) {
        next = h;
    }

    @Override
    public void handle(Logs logs) {
        // logs to server
        if(next!= null) // yes its null
        next.handle(logs);
    }
}