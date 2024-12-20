# Hotel Management System

A Hotel Management System developed using Spring Boot, MySQL, AWS, ReactJS, and Bootstrap. The system is designed to help hotel staff efficiently manage bookings, rooms, and customer information. This project provides a user-friendly interface for both admins and customers, allowing smooth operations for day-to-day hotel management tasks.

## Features

- **User Management**: Allows customers to register, log in, and manage their profiles.
- **Booking System**: Enables customers to book, cancel, and view reservations.
- **Room Management**: Admins can add, update, or remove rooms and set room availability.
- **Payment Integration**: Handles the payment process for bookings.
- **Admin Dashboard**: Provides admins with the ability to view all bookings, room availability, and customer information.
- **Responsive UI**: Designed using ReactJS and Bootstrap for a mobile-friendly experience.

## Technologies Used

- **Backend**: Spring Boot, MySQL
- **Frontend**: ReactJS, Bootstrap
- **Cloud**: AWS
- **Version Control**: GitHub

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
- Node.js and npm
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

### Frontend Setup

1. Navigate to the frontend directory:
    ```bash
    cd frontend
    ```

2. Install the required dependencies:
    ```bash
    npm install
    ```

3. Start the React application:
    ```bash
    npm start
    ```

The frontend will now be running on `http://localhost:3000`.

## Usage

1. Open your browser and go to `http://localhost:3000` for the frontend.
2. You can log in as a customer or as an admin.
3. As a customer, you can browse available rooms, make bookings, and view your reservation history.
4. As an admin, you can manage room details, view all bookings, and update customer records.
5. Use Postman to test the backend APIs as described above.

## Contributing

Feel free to fork the repository, create pull requests, and contribute to the development of the project. All contributions are welcome!

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

## Contact

For any inquiries or suggestions, please contact me at [your-email@example.com](mailto:your-email@example.com).

---

Thank you for checking out the Hotel Management System! Enjoy using the system and feel free to contribute to making it even better.
