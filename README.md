# APPLICATION CHAT JAVA RMI

Dans ce projet, nous allons créer un programme de discussion simple utilisant deux utilisateurs.

Un utilisateur discutera côté serveur, tandis que l'autre discutera côté client de l'application RMI.

### => Du côté serveur :  
     ~ Serveur ~ :
Tout d'abord , On crée une instance depuis le serveur.

Puis , on définie l'objet sous le nom de RMISC.

PS: en cas de besoin d'une instance il faut juste faire un appel au RMISCt.

![](serveur.PNG)

     ~ Implementation du Serveur ~ :  
On commence, par avoir une liste de client qui seront dessus une fois ajouter. 

![](implementationserver.PNG)

       ~ Interface du Serveur ~ :


 ![](interfaceserver.PNG)

### => Du côté client :
       ~ Client ~ :
Puisque q'on est sur le meme pc on definit "localhost" ou "127.0.0.1" c'est équivalent.

le lookup c'est une méthode qui va nous permettre de chercher le RMISC.

![](client.PNG)   

       ~ Implementation du Client ~ :  

 On aura besoin ici d'un constructeur afin qu'il puisse créer un client en lui definissant le nom du client et le nom du serveur.

 ![](implementationclient1.PNG)  

 Puis on affiche et on lit le message de client.

 ![](implementationclient2.PNG)   

      ~ Interface du client ~ :  

  ![](interfaceclient.PNG)

  ### Démonstration

![](1.PNG)

![](2.PNG)  

![](3.PNG)

![](4.PNG)



 #  by Meryem Sghiri
