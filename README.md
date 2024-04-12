# CORS & IDOR Extension

This project contains two separate extensions for checking Cross-Origin Resource Sharing (CORS) and Insecure Direct Object References (IDOR) related headers in HTTP request headers.

## Installation

- Clone the repository.
- Install each extension in OWASP ZAP as follows:
    - For CORS Extension:
        - Build the extension from the `cors-extension` directory.
        - Load the built `.zap` file in OWASP ZAP.
    - For IDOR Extension:
        - Build the extension from the `idor-extension` directory.
        - Load the built `.zap` file in OWASP ZAP.

For more information, refer to the respective README files in each extension directory.
