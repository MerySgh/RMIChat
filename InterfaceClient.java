
import java.rmi.Remote;
import java.rmi.RemoteException;



public interface  InterfaceClient extends Remote{
  void extraireMessage(String message) throws RemoteException;
}
