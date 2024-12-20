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
        public class AccommodationFactory {
            public static Accommodation createAccommodation(String type) {
                switch (type) {
                    case "Hotel":
                        return new Hotel();
                    case "Hostel":
                        return new Hostel();
                    case "Resort":
                        return new Resort();
                    default:
                        return null;
                }
            }
        }

        abstract class Accommodation {
            public abstract String getDetails();
        }

        class Hotel extends Accommodation {
            public String getDetails() {
                return "Hotel: Comfortable rooms with amenities.";
            }
        }

        class Hostel extends Accommodation {
            public String getDetails() {
                return "Hostel: Shared rooms for budget travelers.";
            }
        }

        class Resort extends Accommodation {
            public String getDetails() {
                return "Resort: Luxurious stay with recreational facilities.";
            }
}

