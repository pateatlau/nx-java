# nx-java

Nx monorepo for Java (Springboot)

## Important commands

- `nx run-many -t test`: To test all the projects (whether they are apps or libs, it doesn't matter).
- `nx run-many -t build`: To build all the projects (whether they are apps or libs, it doesn't matter).
- `nx run-many -t run`: To run all the projects (whether they are apps or libs, it doesn't matter).
- `nx affected --target:test --base=HEAD~1`: To test all the projects that have changed in last commit.
- `nx affected --target:build --base=HEAD~1`: To build all the projects that have changed in last commit.
- `nx affected --target:run --base=HEAD~1`: To run all the projects that have changed in last commit.
- `nx graph --affected --base=HEAD~1`: Show dependency graph of all projects and highlight the projects that have changed in last commit.
