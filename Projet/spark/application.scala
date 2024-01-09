import org.apache.spark.sql.SparkSession

object AverageTransmission {
  def main(args: Array[String]): Unit = {
    // Créer une session Spark
    val spark = SparkSession.builder
      .appName("AverageTransmission")
      .master("local[*]") // Vous pouvez changer ceci en mode cluster pour un environnement distribué
      .getOrCreate()

    try {
      // Charger le fichier CSV des voitures (ou le format que vous utilisez)
      val carsDF = spark.read
        .option("header", "true") // Si le fichier CSV a une ligne d'en-tête
        .csv("/chemin/vers/votre/fichier/voitures.csv")

      // Renommer les colonnes au besoin
      val renamedDF = carsDF.withColumnRenamed("currentColumnName", "newColumnName")

      // Calculer la moyenne par transmission
      val averageByTransmission = renamedDF.groupBy("transmission")
        .agg(avg("colonneAVerifier").alias("moyenne"))

      // Afficher les résultats
      averageByTransmission.show()

    } finally {
      // Arrêter la session Spark
      spark.stop()
    }
  }
}