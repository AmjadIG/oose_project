package businesslogic.client;

import businesslogic.client.domain.User;

import java.util.List;

public class StateGame {
    private List<String> rollBack;
    private List<User> connectedUsers;

    public void update(String command){
        rollBack.add(command);
    }

    public List<String> getRollBack() {
        return rollBack;
    }
    public void setRollBack(List<String> rollBack) {
        this.rollBack = rollBack;
    }

    public List<User> getConnectedUsers() {
        return connectedUsers;
    }
    public void setConnectedUsers(List<User> connectedUsers) {
        this.connectedUsers = connectedUsers;
    }

    //TODO
    public void notifyState(){ //notify to the view the changes of the game
        Facade.rollBackState(rollBack);
    }
    //TODO
    public void updateBuffer(){ //update the state of ObjectBuffer

    }
}
