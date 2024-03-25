import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Zoli
 */
public class MessagingService {
    private ArrayList<Message> mess;
    
    public MessagingService() {
        this.mess = new ArrayList<>();
    }
    
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            mess.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return this.mess;
    }
    
    
    
}
