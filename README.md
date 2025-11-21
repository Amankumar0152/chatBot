# Chatbot Application

A fully functional Chatbot application built using **Java** and **Spring Boot**.  
This project demonstrates how to design clean REST APIs, process user messages, and return dynamic chatbot responses.  
It is ideal for beginners who want to learn Spring Boot, APIs, controllers, and JSON handling.

---

## 🚀 Features

- REST API-based chatbot  
- Sends and receives messages in JSON format  
- Clean controller + service architecture  
- Easy to extend (add more responses, add AI logic, etc.)  
- Lightweight and beginner-friendly  
- Supports JSON request/response formats  

---

## 🛠️ Technologies Used

- **Java 17**  
- **Spring Boot** (Web)  
- **Maven**  
- **Lombok** *(optional)*  
- **Postman / Browser** for testing  

---

## 📁 Project Structure

```
src/
 └── main/
     └── java/
         └── com.example.chatbot/
             ├── controller/
             │     └── ChatController.java
             ├── service/
             │     └── ChatService.java
             └── model/
                   └── Message.java
 └── resources/
       └── application.properties
```

---

## 📡 API Endpoints

### **1️⃣ Send message to Chatbot**
```
POST /chat
```

### Example Request:
```json
{
  "message": "Hello chatbot"
}
```

### Example Response:
```json
{
  "reply": "Hello! How can I help you today?"
}
```

---

## 🧪 How to Run the Project

1. Clone the repository:
   ```bash
   git clone https://github.com/Amankumar0152/chatbot.git
   ```

2. Navigate into the project:
   ```bash
   cd chatbot
   ```

3. Run the application:
   ```bash
   mvn spring-boot:run
   ```

4. Test the API using Postman or Browser.

---

## 📌 Future Enhancements

- Add AI/ML model for smarter replies  
- Add database (MySQL/PostgreSQL)  
- Add front-end UI using React.js  
- Add chat history storage  

---

## 📄 License
This project is open-source. You may modify and use it for learning or development.

---

## 👤 Author

**Aman Kumar (Amankumar0152)**  
Project created for learning Spring Boot and API development.
