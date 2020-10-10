# Movie Rental
A pet project to try out concepts of Clean Architecture and Domain Driven Design.

## Tech
- Kotlin
- Spring Boot
- Gradle

## How to run
```bash
    ./gradlew bootRun
```

## Decisions
### Project Structure
| # | Option        | Pros                                                                  | Cons                                                               |
| - |:-------------:|:---------------------------------------------------------------------:|:------------------------------------------------------------------:|
| 1 | One Module    | Simple to set up                                                      | No clear separation, hard to enforce architecture                  |
| 2 | Core & Shell  | Clear separation core and shell which can architecturally be enforced | Harder to set up, enforcing architecture within modules still hard |
| 3 | Layer Modules | Clear architectural separation which is easy to enforce               | Hardest to set up                                                  |   
Outcome: Implement option 2 to separate the core/domain for the shell concerns.

###

##Requirements
1. Show available movies for rental

