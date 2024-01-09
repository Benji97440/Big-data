#Scraping de voiture d'occasion

# Exécution
La première étape est de crée run réseau local
```
docker network create --driver=bridge pipeline 
```
  
Pour lancer le projet lancer la commande suivante
```
docker compose up --build -d
```
  
Lancer un conteneur kafka pour lancer le processus
```
docker exec -it kafka-1 bin/bash
```
  
Vous pouvez vérifier la bonne réception des données sur les voitures avec la commande suivante
```
/kafka/bin/kafka-console-consumer.sh --bootstrap-server kafka-1:9092,kafka-2:9092,kafka-3:9092 --topic Cars --from-beginning
```
  
Pour voir les données sur HDFS lancé les commandes suivantes
```
a changer
```
  
Pour lancer lancer Grafana entrer la commande suivante dans votre terminale 
```
a changer
```
  

# Explication et fonctionnent des conteneurs
### Scraping 
### Zookeeper
### Kafka
### Spark
### HDFS
### InfluxDB
### Grafana





