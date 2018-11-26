

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;

import java.util.ArrayList;



public class ImplementationServeur extends UnicastRemoteObject implements InterfaceServeur{

  public static final long serialVersionUID=1L;

  private ArrayList<InterfaceClient> chatClients;

  protected ImplementationServeur() throws RemoteException{
    chatClients = new ArrayList<InterfaceClient>();
  }
  public synchronized void ajouterClient(InterfaceClient client)throws RemoteException{
    this.chatClients.add(client);
  }

  public synchronized void diffuserMessage(String message)throws RemoteException{
    int i=0;
    while(i<chatClients.size()){
      chatClients.get(i++).extraireMessage(message);
    }

  }



}
