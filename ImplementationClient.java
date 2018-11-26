

import java.rmi.server.UnicastRemoteObject;
import java.rmi.RemoteException;
import java.util.Scanner;



public class ImplementationClient extends UnicastRemoteObject implements InterfaceClient, Runnable{
  public static final long serialVersionUID=2L;
  private InterfaceServeur serveurChat;
  private String nom=null;
  protected ImplementationClient(String nom,InterfaceServeur serveur) throws RemoteException{
    this.nom=nom;
    this.serveurChat=serveur;
    serveurChat.ajouterClient(this);
  }


  public void extraireMessage(String message) throws RemoteException{
        System.out.println(message);
  }

  @Override
  public void run(){
    Scanner scanner=new Scanner(System.in);
    String message;

    while(true){
      message=scanner.nextLine();
      try{
        serveurChat.diffuserMessage(nom + ": "+message);

      }catch(RemoteException e){
          e.printStackTrace();
      }
    }


  }
}
