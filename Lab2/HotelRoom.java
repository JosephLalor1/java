// Student Name 	: Joseph Lalor
// Student Id Number: 
// Date 			: 16/09/25
// Purpose 			:
public class HotelRoom 
    {
        private int roomNumber;
        private String roomType;
        private Boolean isOccupied = false;
        private double rate;

        public HotelRoom()
            {
                setRoomNumber(0);
                setRoomType("Single");
                setRate(0);
                setIsOccupied(false);
            }

        public HotelRoom(int num, String type, Boolean occ, double rateNum)
            {
                setIsOccupied(false);
                setRate(0);
                setRoomNumber(0);
                setRoomType("Single");
            }

        public void setRoomNumber(int num)
            {
                roomNumber = num;
            }
        
        public void setRate(double num)
            {
                rate = num;
            }
        
        public void setIsOccupied(Boolean occ)
            {
                if (!isOccupied || !occ)
                    {
                        isOccupied = occ;
                    }
                else if (isOccupied && occ)
                    {
                        System.out.println("Input invalid");
                    }
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
        
        public Boolean getIsOccupied()
            {
                return isOccupied;
            }

        public String getRoomType()
            {
                return roomType;
            }
    }
