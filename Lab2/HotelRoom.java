// Student Name 	: Joseph Lalor
// Student Id Number: 
// Date 			: 16/09/25
// Purpose 			:
public class HotelRoom 
    {
        private int roomNumber;
        private String roomType;
        private double rate;
        private boolean occupied;

        public HotelRoom()
            {
                setRoomNumber(0);
                setRoomType("Single");
                setRate(0);
            }

        public HotelRoom(int num, String type, double rateNum)
            {

                if (!isOccupied())
                    {
                        setRate(rateNum);
                        setRoomNumber(num);
                        setRoomType(type);
                    }

            }

        public void setRoomNumber(int num)
            {
                roomNumber = num;
            }
        
        public void setRate(double num)
            {
                rate = num;
            }
        
        public Boolean isOccupied()
            {
                if (this.isOccupied())
                    {
                        return true;
                    }
                return false;
            }
        
        public void setRoomType(String type)
            {
                type = type.toLowerCase();
                if(type.equals("single") || type.equals("double"))
                    {
                        roomType = type;
                    }
                else
                    {
                        System.out.println("Input invalid");
                    }
            }
        
        public int getRoomNumber()
            {
                return roomNumber;
            }

        public double getRate()
            {
                return rate;
            }

        public String getRoomType()
            {
                return roomType;
            }
    }
