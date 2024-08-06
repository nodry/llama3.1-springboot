
---

# Llama 3.1 Spring Boot Integration

This project demonstrates how to integrate Llama 3.1 with a Spring Boot application. It showcases how to use the `spring-ai-ollama-spring-boot-starter` library to incorporate the Llama 3.1 model into a Spring Boot application for various use cases.

## Features

- **Integration with Llama 3.1**: Seamlessly connect Llama 3.1 with Spring Boot.
- **Sentiment Analysis**: Implement sentiment analysis capabilities.
- **Custom Models**: Use custom models with the Llama framework.
- **REST API**: Provides a RESTful interface for interacting with the Llama 3.1 model.

## Prerequisites

- Java 17 or later
- Spring Boot 3.x
- Maven or Gradle (for dependency management)
- Llama 3.1 model files (download from the [official source](https://ollama.com))

## Getting Started

### Clone the Repository

```bash
git clone https://github.com/kevinjam/llama-3.1-spring-boot-integration.git
cd llama-3.1-spring-boot-integration
```

### Configure the Project

1. **Add your Llama 3.1 model files** to the `src/main/resources/models` directory.
2. **Update the configuration** in `application.properties` or `application.yml` with your model path and other relevant settings.

### Build the Project

Using Maven:

```bash
mvn clean install
```

Using Gradle:

```bash
./gradlew build
```

### Run the Application

```bash
mvn spring-boot:run
```

or

```bash
./gradlew bootRun
```

### Access the API

Once the application is running, you can access the REST API endpoints. For example, to analyze sentiment:

```
POST http://localhost:8080/ai
```

**Request Body:**


```
message=Generate the filmography for 5 movies for  Michael Scofield

```


**Response:**

```json
[
  {
    "actor": "Michael Scofield",
    "movies": [
      "The Break-Up",
      "The Good Shepherd",
      "Gone Baby Gone",
      "Swimfan",
      "A History of Violence"
    ]
  }
]

```

## Contributing

Contributions are welcome! Please follow these steps to contribute:

1. Fork the repository.
2. Create a new branch (`git checkout -b feature/your-feature`).
3. Commit your changes (`git commit -am 'Add new feature'`).
4. Push to the branch (`git push origin feature/your-feature`).
5. Create a new Pull Request.

## License

This project is licensed under the [MIT License](LICENSE).

## Contact

For questions or feedback, please open an issue on [GitHub](https://github.com/kevinjam/llama-3.1-spring-boot-integration/issues).

---

