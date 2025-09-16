// Student Name 	: Joseph Lalor
// Student Id Number: 
// Date 			: 16/09/25
// Purpose 			:
class Hotel 
    {
        public static void main(String[] args) 
            {
                HotelRoom roomA = new HotelRoom();
                HotelRoom roomB = new HotelRoom();
                HotelRoom roomC = new HotelRoom(202, "Single", true, 90);

                roomA.setRoomType("Single");
                roomB.setRoomType("Double");
                roomA.setRoomNumber(200);
                roomB.setRoomNumber(201);
                roomA.setIsOccupied(false);
                roomB.setIsOccupied(true);
                roomA.setRate(100);
                roomB.setRate(80);

                System.out.println("room number is " + roomA.getRoomType() + ", type is " + roomA.getRoomNumber() + ", occupancy is " + roomA.getIsOccupied() + ", rate is " + roomA.getRate());
                System.out.println("room number is " + roomB.getRoomType() + ", type is " + roomB.getRoomNumber() + ", occupancy is " + roomB.getIsOccupied() + ", rate is " + roomB.getRate());
                System.out.println("room number is " + roomC.getRoomType() + ", type is " + roomC.getRoomNumber() + ", occupancy is " + roomC.getIsOccupied() + ", rate is " + roomC.getRate());
            }
    }
