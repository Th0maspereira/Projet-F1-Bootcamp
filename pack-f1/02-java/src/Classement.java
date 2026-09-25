/* =========================================================================
   MAILLON 2 — JAVA : le moteur de calcul
   Complétez les quatre méthodes. Les classes Ligne, Resultat et Chargeur
   sont fournies : ne les modifiez pas.
       javac -encoding UTF-8 -d out src/*.java
       java -Dstdout.encoding=UTF-8 -cp out Tests     (les tests)
       java -Dstdout.encoding=UTF-8 -cp out Main      (la production)
   ========================================================================= */

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

public class Classement {

    /** Barème officiel des dix premiers. FOURNI — NE PAS MODIFIER. */
    public static final int[] BAREME = {25, 18, 15, 12, 10, 8, 6, 4, 2, 1};

    // 1. pointsPourPosition(position) : points marqués pour cette position.
    //    1 -> 25, 2 -> 18, ..., 10 -> 1. Au-delà de la 10e place : 0.
    //    Un abandon vaut la position 0, donc 0 point.
    public static int pointsPourPosition(int position) {
        if (position >= 1 && position <= 10) {
            return BAREME[position - 1];
        }
        return 0;
    }   

    // 2. classementPilotes(lignes) : un Resultat par pilote, avec ses points,
    //    ses victoires (position 1) et ses 2e places, trié par :
    //    points décroissants, puis victoires, puis 2e places, puis nom (A→Z).
    public static List<Resultat> classementPilotes(List<Ligne> lignes) {
        Map<String, Resultat> map = new HashMap<>();

        for (Ligne ligne : lignes) {
            String pilote = ligne.pilote();
            String ecurie = ligne.ecurie();
            int position = ligne.position();

            Resultat res = map.get(pilote);
            if (res == null) {
                res = new Resultat(pilote, ecurie);
                map.put(pilote, res);
            }

            res.points += pointsPourPosition(position);
            if (position == 1) {
                res.victoires++;
            } else if (position == 2) {
                res.deuxiemes++;
            }
        }

        List<Resultat> resultats = new ArrayList<>(map.values());
        
        resultats.sort((r1, r2) -> {
            if (r2.points != r1.points) {
                return Integer.compare(r2.points, r1.points);
            }
            if (r2.victoires != r1.victoires) {
                return Integer.compare(r2.victoires, r1.victoires);
            }
            if (r2.deuxiemes != r1.deuxiemes) {
                return Integer.compare(r2.deuxiemes, r1.deuxiemes);
            }
            return r1.nom.compareTo(r2.nom);
        });

        return resultats;
    }

    // 3. classementEcuries(pilotes) : additionne les points, victoires et
    //    2e places des pilotes de chaque écurie. Même ordre de tri.
    public static List<Resultat> classementEcuries(List<Resultat> pilotes) {
        public static List<Resultat> classementEcuries(List<Resultat> pilotes) {
        Map<String, Resultat> map = new HashMap<>();

        for (Resultat p : pilotes) {
            String ecurie = p.ecurie;
            Resultat res = map.get(ecurie);
            if (res == null) {
                res = new Resultat(ecurie, "");
                map.put(ecurie, res);
            }

            res.points += p.points;
            res.victoires += p.victoires;
            res.deuxiemes += p.deuxiemes;
        }

        List<Resultat> resultats = new ArrayList<>(map.values());

        resultats.sort((r1, r2) -> {
            if (r2.points != r1.points) {
                return Integer.compare(r2.points, r1.points);
            }
            if (r2.victoires != r1.victoires) {
                return Integer.compare(r2.victoires, r1.victoires);
            }
            if (r2.deuxiemes != r1.deuxiemes) {
                return Integer.compare(r2.deuxiemes, r1.deuxiemes);
            }
            return r1.nom.compareTo(r2.nom);
        });

        return resultats;
    }
        return null;
    }

    // 4. positionMoyenne(lignes, pilote) : moyenne des positions de ce pilote,
    //    ABANDONS EXCLUS, arrondie à 2 décimales. 0 s'il n'a jamais terminé.
    //    Ex. positions 1, 2 et un abandon -> 1.5
    public static double positionMoyenne(List<Ligne> lignes, String pilote) {
        // À COMPLÉTER
        return 0;
    }
}
