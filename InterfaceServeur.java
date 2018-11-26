

import java.rmi.Remote;
import java.rmi.RemoteException;

import java.util.ArrayList;

public interface InterfaceServeur extends Remote{

  void ajouterClient(InterfaceClient client)throws RemoteException;
  void diffuserMessage(String message)throws RemoteException;

}
