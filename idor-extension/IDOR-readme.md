# IDOR Extension

This extension checks for Insecure Direct Object References (IDOR) related headers in HTTP request headers.

## Usage

- Install the extension in OWASP ZAP.
- The extension will automatically check for IDOR-related headers in intercepted HTTP requests.

For more information, refer to the [IdorExtension.java](src/main/java/extension/IdorExtension.java) and [IdorHeaderChecker.java](src/main/java/extension/IdorHeaderChecker.java) files.
