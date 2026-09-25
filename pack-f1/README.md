Python 

exercices 1

Je retire les espaces et vérifie si le texte est vide (je renvoie None si c'est le cas). Ensuite, je sépare les minutes des secondes grâce au deux-points, je convertis le tout en nombres, je multiplie les minutes par 60, j'ajoute les secondes et j'arrondis à 3 décimales. Enfin, je gère les erreurs de format pour éviter que le programme ne plante.

exercices 2 

Je lis mon fichier CSV ligne par ligne pour récupérer les informations de chaque course. Pour chaque ligne, je traite la position en la mettant à 0 si elle est vide ou "ABANDON", et je convertis le temps du tour en secondes. Je regroupe ensuite ces données(course, pilote, ecurie, position et temps_tour) dans un dictionnaire que j'ajoute à ma liste de résultats, avant de fermer le fichier et de renvoyer la liste complète.

exercices 3 

Je crée une fonction pour écrire un nouveau fichier CSV propre en respectant le contrat. J'ouvre le fichier en mode écriture, j'écris d'abord l'en-tête avec les colonnes course, pilote, ecurie, position et temps_tour. Ensuite, je parcours chaque élément de ma liste de lignes : je formate le temps du tour avec trois décimales s'il existe ou je le laisse vide si c'est none, puis j'écris chaque ligne dans le fichier CSV dans l'ordre où je les reçois.

Java

exercice 1

J'utilise le barème des 10 premiers pour attribuer les points en fonction de la position d'un pilote. Si la position se situe entre 1 et 10, je récupère le nombre de points correspondant dans le tableau (en faisant position - 1 comme les indices commencent à 0). Au-delà de la 10eme place ou en cas d'abandon (position 0), je retourne 0 point.

exercice 2

Pour créer ce classement, je commence par parcourir toutes les lignes de course de la saison. Je regroupe les données de chaque pilote grâce à un dictionnaire pour additionner leurs points selon le barème, tout en comptant leurs victoires et leurs deuxièmes places. je transforme ces résultats en liste pour les trier du plus grand au plus petit nombre de points, puis par le nombre de victoires, puis de deuxièmes places, et enfin par ordre alphabétique sur le nom si tout le reste est égal.

exercice 3 

Pour regrouper les résultats par écurie, je parcours la liste des pilotes triée et j'utilise un dictionnaire pour additionner leurs points, leurs victoires et leurs deuxièmes places par nom d'écurie. Ensuite, je transforme ces données en liste pour leur appliquer le même ordre de tri que pour les pilotes : d'abord le plus grand nombre de points, puis les victoires, puis les deuxièmes places, et enfin le nom de l'écurie par ordre alphabétique si tout le reste est égal.

js

exercice 1

Pour trier cette liste sans modifier la liste originale, je commence par en faire une copie grâce à slice(). Ensuite, j'applique un tri décroissant : je compare d'abord les points des éléments, et si tout le reste est egal, je départage les concurrents en comparant leur nombre de victoires

exercice 2

Pour mettre à jour le tableau HTML, je commence par récupérer la table et j'efface tout le contenu existant pour le remplacer. Ensuite, je parcours chaque élément de la liste pour créer dynamiquement une ligne tr avec l'attribut data-nom, ainsi que les différentes cellules td contenant le rang, le nom, l'écurie, les points et le nombre de victoires, avant d'injecter le tout proprement dans la page.

exercice 3

Pour le podium, je récupère d'abord toutes les lignes tr du tableau ciblé. Ensuite, je parcours l'ensemble de ces lignes avec une boucle : j'ajoute la classe CSS podium aux trois premières (i < 3), et je m'assure de la retirer de toutes les autres pour éviter les incohérences.