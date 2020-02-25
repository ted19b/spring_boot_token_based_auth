# spring_boot_token_based_auth

We will be developing a Spring Boot application that makes use of JWT authentication for securing an exposed REST API.

JSON Web Tokens, commonly known as JWTs, are tokens that are used to authenticate users on applications. This technology has gained popularity over the past few years because it enables backends to accept requests simply by validating the contents of these JWTS. That is, applications that use JWTS no longer have to hold cookies or other session data about their users. This characteristic facilitates scalability while keeping applications secure.

During the traditional web architecture, session cookies ruled the authentication world. Even though, stateless approach of REST makes session cookies inappropriate from the security standpoint, but they are still widely used. And this leads to following well known common drawbacks in addition to the infamous threats like session hijacking

During the authentication process, when a user successfully logs in using their credentials, a JSON Web Token is returned and must be saved locally (typically in local storage). Whenever the user wants to access a protected route or resource (an endpoint), the user agent must send the JWT, usually in the Authorization header using the Bearer schema, along with the request.

Let’s look at the workflow for a better understanding:

1 -  User send a request with a username and password. 
    
    POST /authentication 
    {
        "username": "max",
        "password": "pass"
    }

   
2 - Server validate the Username and password. Generate and sign the JWT using a secret key.

3 - Client API sends token in each request as part of authentication.
    
    GET /sensitive_info
    Header 
    Authorization : Bearer lkjdfk5ds56jklfjDJYLklfajdlakj...
    
4 - When a backend server receives a request with a JWT, the first thing to do is to validate the token. This consists of a series of steps, and if any of these fails then, the request must be rejected. The following list shows the validation steps needed:

    . Check that the JWT is well formed
    . Check the signature
    . Validate the standard claims
    . Check the Client permissions (scopes)
    
5 - Server return response 

    HTTP 1.1
    200 OK 