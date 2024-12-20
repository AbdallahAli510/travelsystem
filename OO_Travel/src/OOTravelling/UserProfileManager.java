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
public class UserProfileManager {
    private static UserProfileManager instance; // Singleton Instance
    private String username;
    private int loyaltyPoints;
    private List<String> bookingHistory;

    private UserProfileManager() {
        bookingHistory = new ArrayList<>();
        loyaltyPoints = 0; // يبدأ المستخدم بـ 0 نقاط
    }

    public static UserProfileManager getInstance() {
        if (instance == null) {
            instance = new UserProfileManager();
        }
        return instance;
    }

    // تعيين تفاصيل المستخدم
    public void setUserDetails(String username) {
        this.username = username;
    }

    // إضافة حجز إلى السجل
    public void addBookingToHistory(String bookingDetails) {
        bookingHistory.add(bookingDetails);
    }

    // زيادة نقاط الولاء
    public void addLoyaltyPoints(int points) {
        loyaltyPoints += points;
    }

    // الحصول على اسم المستخدم
    public String getUsername() {
        return username;
    }

    // الحصول على نقاط الولاء
    public int getLoyaltyPoints() {
        return loyaltyPoints;
    }

    // الحصول على سجل الحجز
    public List<String> getBookingHistory() {
        return bookingHistory;
    }
}

