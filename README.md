# Hotel Management System - Backend

A Hotel Management System backend developed using **Spring Boot**, **MySQL**, and deployed on **AWS**. The system is designed to manage room availability, bookings, and customer information through RESTful APIs for admins and customers.

## Features

- **Room Management**: Manage room availability, details, and room types.
- **Booking Management**: Create, update, cancel, and view bookings.
- **Customer Management**: Store and manage customer details.
- **Admin Dashboard**: Allows admins to view, update, and manage all bookings, rooms, and customers.
- **Payment Integration**: Handle the payment process for bookings.
- **RESTful APIs**: Expose endpoints for interacting with room, booking, and customer data.

## Technologies Used

- **Backend Framework**: Spring Boot
- **Database**: MySQL
- **Cloud**: AWS
- **Version Control**: GitHub
- **API Architecture**: RESTful APIs

## API Testing with Postman

Postman was used to test the API endpoints in the Hotel Management System. You can import the provided Postman collection to easily test the backend APIs.

### Postman Collection

You can import the API collection in Postman to test various endpoints. Download the collection file from the repository and import it into your Postman:

1. Open Postman.
2. Click on `Import`.
3. Select the downloaded `Hotel_Management_API.postman_collection.json` file.
4. The collection will be added to your Postman, and you can start testing the endpoints.

### API Endpoints

Here are some of the key API endpoints you can test with Postman:

- **POST /api/auth/register** - Register a new customer.
- **POST /api/auth/login** - Login a customer or admin.
- **GET /api/rooms** - Get all available rooms.
- **POST /api/bookings** - Create a new booking.
- **GET /api/bookings/{id}** - Get booking details by ID.
- **PUT /api/rooms/{id}** - Update room details (Admin only).
- **DELETE /api/bookings/{id}** - Cancel a booking (Admin only).

For more details about the API endpoints, refer to the Postman collection or the API documentation.

## Installation

### Prerequisites

- Java 11 or higher
- MySQL 5.7 or higher
- AWS Account (for deployment)

### Backend Setup

1. Clone the repository:
    ```bash
    git clone https://github.com/Ronitsabhaya75/Hotel-Management-System.git
    ```

2. Navigate to the backend directory and install dependencies:
    ```bash
    cd backend
    ```

3. Configure your database connection in the `application.properties` file:
    ```properties
    spring.datasource.url=jdbc:mysql://localhost:3306/hotel_management_system
    spring.datasource.username=root
    spring.datasource.password=yourpassword
    ```

4. Run the Spring Boot application:
    ```bash
    mvn spring-boot:run
    ```

### Database Setup

1. Set up a **MySQL** database (e.g., `hotel_management_system`).
2. Apply the SQL scripts for creating the necessary tables (found in the `src/main/resources` folder).

## Usage

1. Start the backend server by running the Spring Boot application.
2. Use Postman to test the available API endpoints as described above.
3. Access the APIs to manage rooms, bookings, and customer information.

## Contributing

Feel free to fork the repository, create feature branches, and submit pull requests. For any issues or bugs, open an issue in the repository.

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any inquiries or suggestions, please contact me at [your-email@example.com](mailto:your-email@example.com).
