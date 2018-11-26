import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.text.SimpleDateFormat;

import java.rmi.NotBoundException;

public class Serveur{
  public static void main(String[] args) throws RemoteException,MalformedURLException,NotBoundException{
    Naming.rebind("RMICS", new ImplementationServeur());
  }
}
