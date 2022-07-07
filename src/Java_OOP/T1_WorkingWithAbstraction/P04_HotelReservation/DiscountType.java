package Java_OOP.T1_WorkingWithAbstraction.P04_HotelReservation;

public enum DiscountType {

        VIP(20),
        SecondVisit(10),
        None(0);

        private int percentage;

        DiscountType(int percentage) {
            this.percentage = percentage;
        }

        public int getPercentage() {
            return percentage;
        }
    }
