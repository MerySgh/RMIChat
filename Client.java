import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.NotBoundException;
import java.net.MalformedURLException;


public class Client{
  public static void main(String[] args) throws RemoteException,MalformedURLException,NotBoundException{
    InterfaceServeur serveurChat = (InterfaceServeur)Naming.lookup("rmi://localhost/RMICS");
    new Thread (new ImplementationClient (args[0],serveurChat)).start();
  }
}
