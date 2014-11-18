# Android startup #

This is an android startup project which contains a very organized package structure, this consists in two major sub-packages: frontend and backend.

The backend package has a RESTful client powered by Retrofit and GSON libraries. Also it has a model sub-package, the latter has inside POJOs annotated with @SerializedName to tell Gson how to serialize the object to JSON.

The frontend scheme is a set of Fragments, inspired on MVC schema fragments are treated as views/controllers and populated by data returned by the backend model.

### What is this repository for? ###

* This is a proposal to organizate your android project, with all the network functionality, data models and easy-to-implement server API json response -> java model conversion via retrofit and gson libraries.

### How do I get set up? ###

* This is intended to be used with android studio >= 0.8.14
* Fork the project, import it into android studio and try it!
* There are basic tasks to set the project up, find them by looking all the TODOs in the project.

### Contribution ###

* If you want to contribute with something, all suggestions are welcome.
