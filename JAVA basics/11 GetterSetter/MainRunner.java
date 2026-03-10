public class MainRunner{
	
    public static void main(String[] args) {
		
        Student student=new Student();
		if (student!=null){
        student.setId(4);
        student.setName("Mike");
        student.setAge(24);
        student.setEmail("mike@gmail.com");
        student.setCourse("Computer Science");
        student.setMarks(88.534d);
        student.setCollege("Dabba College");
        student.setPhone(983454365L);
        student.setAddress("Bangalore");

        System.out.println("Student Details");
        System.out.println("Id : "+student.getId());
        System.out.println("Name : "+student.getName());
        System.out.println("Age : "+student.getAge());
        System.out.println("Eamil : "+student.getEmail());
        System.out.println("Course : "+student.getCourse());
        System.out.println("Marks : "+student.getMarks());
        System.out.println("College : "+student.getCollege());
        System.out.println("Phone Number : "+student.getPhone());
        System.out.println("Address : "+ student.getAddress());
		System.out.println("   ");
		}
		else System.out.println("Object bigbasket is not there ,it is null");
		
        Employee employee=new Employee();
		if (employee!=null){
        employee.setEmpId(456);
        employee.setName("Sandy");
        employee.setDepartment("IT");
        employee.setEmail("sandy@gmail.com");
        employee.setSalary(5655);
        employee.setDesignation("Developer");
        employee.setPhone(7843287346L);
        employee.setExperience(7);
        employee.setAddress("Mysore");

        System.out.println("Employee Details");
        System.out.println("Id : "+employee.getEmpId());
        System.out.println("Name : "+employee.getName());
        System.out.println("Department : "+employee.getDepartment());
        System.out.println("Email : "+employee.getEmail());
        System.out.println("Salary : "+employee.getSalary());
        System.out.println("Designation : "+employee.getDesignation());
        System.out.println("Phone Number : "+employee.getPhone());
        System.out.println("Experience : "+employee.getExperience());
        System.out.println("Address : "+employee.getAddress());
		System.out.println("  ");
		}
		else System.out.println("Object bigbasket is not there ,it is null");
		
        Product product=new Product();
		if (product!=null){
        product.setProductId(546);
        product.setProductName("Laptop");
        product.setBrand("Dell");
        product.setPrice(4534);
        product.setQuantity(5);
        product.setCategory("Electronics");
        product.setSupplier("TechStore");
        product.setRating(454.45d);
        product.setDescription("Gaming Laptop");

        System.out.println("Product Details");
        System.out.println("Id : "+product.getProductId());
        System.out.println("Name : "+product.getProductName());
        System.out.println("Brand : "+product.getBrand());
        System.out.println("Price : "+product.getPrice());
        System.out.println("Quantity : "+product.getQuantity());
        System.out.println("Category : "+product.getCategory());
        System.out.println("Supplier : "+product.getSupplier());
        System.out.println("Rating : "+product.getRating());
        System.out.println("Description : "+product.getDescription());
		System.out.println("  ");
		}
		else System.out.println("Object bigbasket is not there ,it is null");

        Book book=new Book();
		if (book!=null){
        book.setBookId(457);
        book.setTitle("Good girls guide to murder");
        book.setAuthor("Holly Jackson");
        book.setPublisher("Tech Publications");
        book.setPrice(874);
        book.setPages(847);
        book.setGenre("Murder");
        book.setEdition(2);
        book.setLanguage("English");

        System.out.println("Book Details");
        System.out.println(book.getBookId());
        System.out.println(book.getTitle());
        System.out.println(book.getAuthor());
        System.out.println(book.getPublisher());
        System.out.println(book.getPrice());
        System.out.println(book.getPages());
        System.out.println(book.getGenre());
        System.out.println(book.getEdition());
        System.out.println(book.getLanguage());
		System.out.println("  ");
		}
		else System.out.println("Object bigbasket is not there ,it is null");
		
        Vehicle vehicle=new Vehicle();
		if (student!=null){
        vehicle.setVehicleId(846);
        vehicle.setBrand("Toyota");
        vehicle.setModel("Fortuner");
        vehicle.setColor("Yellow");
        vehicle.setPrice(84743);
        vehicle.setYear(2023);
        vehicle.setFuelType("Diesel");
        vehicle.setTransmission("Automatic");
        vehicle.setOwner("Shinyoyo");

        System.out.println("Vehicle Details");
        System.out.println(vehicle.getVehicleId());
        System.out.println(vehicle.getBrand());
        System.out.println(vehicle.getModel());
        System.out.println(vehicle.getColor());
        System.out.println(vehicle.getPrice());
        System.out.println(vehicle.getYear());
        System.out.println(vehicle.getFuelType());
        System.out.println(vehicle.getTransmission());
        System.out.println(vehicle.getOwner());
		}
		else System.out.println("Object bigbasket is not there ,it is null");
		
    }

	
}