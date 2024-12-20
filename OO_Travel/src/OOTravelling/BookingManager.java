/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOTravelling;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ALAMIIA
 */
public class BookingManager {
    private static BookingManager instance; // كائن Singleton واحد فقط
    private List<String> bookings;

    // مُنشئ خاص
    private BookingManager() {
        bookings = new ArrayList<>();
    }

    // الوصول إلى الكائن الوحيد (Singleton)
    public static BookingManager getInstance() {
        if (instance == null) {
            instance = new BookingManager();
        }
        return instance;
    }

    // إضافة حجز
    public void addBooking(String bookingType, String details) {
        String booking = bookingType + ": " + details;
        bookings.add(booking);
        System.out.println("Booking Added: " + booking);
    }

    // عرض جميع الحجوزات
    public void listBookings() {
        if (bookings.isEmpty()) {
            System.out.println("No bookings yet.");
        } else {
            System.out.println("Bookings:");
            for (String booking : bookings) {
                System.out.println(booking);
            }
        }
    }
}
