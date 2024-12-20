/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOTravelling;

/**
 *
 * @author ALAMIIA
 */
        public class TravelPackageFactory {
            public static TravelPackage createPackage(String type) {
                switch (type) {
                    case "Luxury":
                        return new LuxuryPackage();
                    case "Adventure":
                        return new AdventurePackage();
                    case "Cultural":
                        return new CulturalPackage();
                    default:
                        return null;
                }
            }
        }

        abstract class TravelPackage {
            public abstract String getDescription();
        }

        class LuxuryPackage extends TravelPackage {
            public String getDescription() {
                return "Luxury Package includes 5-star accommodation and premium flights.";
            }
        }

        class AdventurePackage extends TravelPackage {
            public String getDescription() {
                return "Adventure Package includes outdoor activities and budget-friendly options.";
            }
        }

        class CulturalPackage extends TravelPackage {
            public String getDescription() {
                return "Cultural Package includes historical tours and local experiences.";
            }
}

