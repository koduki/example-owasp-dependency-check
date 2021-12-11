# README

Sample code for OWASP dependency-check.

# check and generate report

```bash
mvn dependency-check:check
```

# show report

```bash
python -m SimpleHTTPServer 8080
open http://localhost:8080/target/dependency-check-report.html
```