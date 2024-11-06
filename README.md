# UserApplicationGraphQL

This is a User Management Application built with Spring Boot, GraphQL, and PostgreSQL, designed to provide a secure, centralized platform for managing user data with Single Sign-On (SSO) integration. The application supports essential user management functionalities—such as user creation, retrieval, and deletion—through a GraphQL API, allowing for efficient and flexible data querying.

# Key Features
User Authentication and Authorization: The application leverages OAuth 2.0 and OpenID Connect (OIDC) for secure user authentication and Single Sign-On, enabling users to log in using a trusted identity provider (e.g., Keycloak, Okta, Google). Only authenticated users can access and query user data, enhancing security.

GraphQL API: The GraphQL API provides efficient querying capabilities, allowing clients to request only the specific user information they need. GraphQL endpoints support functionalities such as:

Retrieving details of individual users.
Fetching lists of users.
Creating and deleting user accounts.
Microservice-Ready Design: Built with a microservices approach, the application can be extended and scaled easily. It integrates smoothly with other microservices, making it adaptable to larger, distributed system architectures.

Exception Handling: A robust exception handling mechanism ensures meaningful error responses for the client, facilitating smoother client interactions and easier debugging.

Database and Persistence: User data is stored in a PostgreSQL database, ensuring data integrity and relational data management. The application also maintains metadata fields like creation and update timestamps for each user.

# Technical Stack
Backend: Spring Boot, GraphQL, Spring Security (OAuth2.0/OIDC)
Database: PostgreSQL
SSO Integration: Supports Keycloak, Okta, or Google as identity providers
API: GraphQL for structured and efficient data queries

# Benefits
This User Management Application provides a secure, scalable, and user-friendly approach to managing user data within a modern microservice architecture. By using SSO, it simplifies the login process for users, reducing the need for multiple credentials and enhancing user experience while maintaining strict access control and data security.
