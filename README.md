# spring-boot-keycloak
Sécurité application spring boot avec keycloak
# Pour démarrer keycloak
standalone.bat -Djboss.socket.binding.port-offset=100

## Installation

keycloak écoute par défaut sur le port 8180 => 127.0.0.1:8180

```bash
Après la création du compte, cliquer sur se admin console pour se connecter
Démarrer keycloak et créer un compte admin en définissant son username et son password.
```
```bash
Au niveau de master, sélectionner add realm
Définir le nom du realm puis cliquer sur créer
Aller sur client et cliquer sur créer
Définir le client ID & le root URL (127.0.0.1:8080) puis cliquer sur enregistrer
```

## Définition des rôles 

```bash
Pour cela, cliquer sur rôle, Ajouter un rôle
Définir le nom du rôle & (donné sa description)
Ici, on a deux rôles pour notre application(admin & user)
```
# Cration des utilisateurs
```bash
Cliquer sur Users ensuite sur add Users
Définir les attributs de l'utilisateur 
Aller sur credential pour définir le mot de passe de l'utilisateur créer
Aller sur rôle Mappings pour attribuer à l'utilisateur créer un rôle
Pour recréer un nouveau utilisateur avec le même processus
```

# Comment générer un tocken d'accès avec keycloak
```bash
Aller sur Realm Settings
Puis sur OpenID Endpoint configuration
Ouvrir dans un nouveau onglet
Et copier la valeur du token_endpoint
```
# Test sur postman
```bash
Créer une requette de type GET avec comme url, la valeur du token_endpoint
Retrouver accès token url en lui donnant la même valeur 
Choisir le type 0Auth2
Remplir le accès tocken URl
Récupérer la valeur du client ID dans la partie client
Renseigner le scope avec openid
Choisir pour Client Authentication send as basic Aouth header
Choisir pour Grand Type -> password credential
```

