# Week 7 – DevOps, Docker, Cloud & Generative AI Fundamentals

## Overview

In Week 7, I learned the basics of **DevOps**, **Docker**, **Cloud Computing**, **CI/CD**, **Kubernetes**, and **Generative AI**. These technologies are widely used in the software industry to develop, deploy, and manage applications efficiently.

---

# Folder Structure

```
Week-7-DevOps-Cloud-GenAI
│
└── README.md
```

---

# 1. DevOps Fundamentals

## What is DevOps?

DevOps is a combination of **Development (Dev)** and **Operations (Ops)**.

It is a software development approach that helps developers and operations teams work together to build, test, deploy, and maintain software quickly and efficiently.

The main goal of DevOps is to deliver high-quality software faster with fewer errors.

---

## DevOps Lifecycle

The DevOps lifecycle consists of the following stages:

```
Plan
   ↓
Develop
   ↓
Build
   ↓
Test
   ↓
Release
   ↓
Deploy
   ↓
Operate
   ↓
Monitor
```

### Explanation of Each Stage

### 1. Plan
Project requirements are gathered and tasks are planned.

### 2. Develop
Developers write the source code.

### 3. Build
The source code is compiled and packaged into an application.

### 4. Test
The application is tested to find and fix bugs.

### 5. Release
The tested application is prepared for deployment.

### 6. Deploy
The application is deployed to production or testing servers.

### 7. Operate
The deployed application is managed and maintained.

### 8. Monitor
The application's performance is continuously monitored.

---

## Benefits of DevOps

- Faster software delivery
- Better teamwork between developers and operations
- Continuous Integration (CI)
- Continuous Deployment (CD)
- Automated testing
- Improved software quality
- Faster bug fixing
- Increased productivity

---

## Popular DevOps Tools

| Tool | Purpose |
|------|----------|
| Git | Version Control |
| GitHub | Code Repository |
| Jenkins | CI/CD Automation |
| Maven | Build Tool |
| Docker | Containerization |
| Kubernetes | Container Orchestration |
| Ansible | Configuration Management |
| Terraform | Infrastructure as Code |
| Prometheus | Monitoring |
| Grafana | Visualization |

---

# 2. Docker Fundamentals

## What is Docker?

Docker is an open-source platform used to create, package, and run applications inside containers.

A container includes the application along with all the libraries and dependencies required to run it.

Because of this, the application behaves the same on every system.

---

## Docker Components

### Docker Engine

The core software that runs Docker.

### Docker Client

The command-line interface used to communicate with Docker.

Example:

```bash
docker run
docker build
```

### Docker Daemon

Runs in the background and manages Docker objects.

### Docker Image

A blueprint or template used to create containers.

### Docker Container

A running instance of a Docker image.

### Docker Registry

A place where Docker images are stored.

### Docker Hub

The public registry provided by Docker.

---

## Docker Workflow

```
Source Code
      ↓
Dockerfile
      ↓
Docker Image
      ↓
Docker Container
      ↓
Deployment
```

---

## Advantages of Docker

- Lightweight
- Portable
- Fast deployment
- Easy scaling
- Consistent environment
- Efficient resource usage

---

## Common Docker Commands

Check Docker version

```bash
docker --version
```

Download an image

```bash
docker pull ubuntu
```

Build an image

```bash
docker build -t myapp .
```

List images

```bash
docker images
```

Run a container

```bash
docker run myapp
```

List running containers

```bash
docker ps
```

Stop a container

```bash
docker stop container_id
```

Remove a container

```bash
docker rm container_id
```

Delete an image

```bash
docker rmi image_name
```

---

# 3. Cloud Computing Fundamentals

## What is Cloud Computing?

Cloud Computing means using computing resources over the internet instead of using your own computer or local server.

Cloud services provide:

- Servers
- Storage
- Databases
- Networking
- Software
- Analytics
- Artificial Intelligence

---

## Cloud Service Models

### 1. IaaS (Infrastructure as a Service)

Provides virtual servers, storage, and networking.

Examples:

- AWS EC2
- Azure Virtual Machines

---

### 2. PaaS (Platform as a Service)

Provides a platform for developing and deploying applications.

Examples:

- Google App Engine
- Azure App Service

---

### 3. SaaS (Software as a Service)

Provides software over the internet.

Examples:

- Gmail
- Microsoft 365
- Salesforce

---

## Cloud Deployment Models

### Public Cloud

Services are available to everyone over the internet.

Example:

AWS

---

### Private Cloud

Used by a single organization.

---

### Hybrid Cloud

Combination of Public Cloud and Private Cloud.

---

### Multi Cloud

Using services from multiple cloud providers.

---

## Major Cloud Providers

- Amazon Web Services (AWS)
- Microsoft Azure
- Google Cloud Platform (GCP)
- Oracle Cloud Infrastructure (OCI)

---

## Benefits of Cloud Computing

- Easy scalability
- High availability
- Cost-effective
- Accessible from anywhere
- Backup and disaster recovery
- Better security

---

# 4. Continuous Integration (CI) and Continuous Deployment (CD)

## Continuous Integration (CI)

CI is the practice of automatically building and testing code whenever developers make changes.

Benefits:

- Detect bugs early
- Faster development
- Automated testing
- Better collaboration

---

## Continuous Deployment (CD)

CD automatically deploys tested applications to production or staging environments.

Benefits:

- Faster releases
- Reduced manual work
- Reliable deployments
- Continuous software delivery

---

# 5. Containerization vs Virtualization

| Virtual Machine | Container |
|-----------------|-----------|
| Includes full Operating System | Shares Host Operating System |
| Heavy | Lightweight |
| Slower startup | Faster startup |
| Uses more memory | Uses less memory |
| Large storage | Small storage |

---

# 6. Kubernetes Basics

## What is Kubernetes?

Kubernetes is an open-source platform used to manage Docker containers automatically.

It helps deploy, scale, and manage containerized applications.

---

## Main Components

- Pod
- Node
- Cluster
- Deployment
- Service
- ReplicaSet

---

## Benefits of Kubernetes

- Automatic scaling
- Load balancing
- Self-healing
- Rolling updates
- High availability

---

# 7. Generative AI Fundamentals

## What is Generative AI?

Generative AI is a type of Artificial Intelligence that creates new content instead of only analyzing existing data.

It can generate:

- Text
- Images
- Audio
- Video
- Code

---

## Popular AI Models

- GPT
- Gemini
- Claude
- Llama

---

## Applications

- Chatbots
- Code generation
- Documentation
- Image generation
- Content writing
- Data analysis
- Software testing

---

## Advantages

- Saves time
- Improves productivity
- Automates repetitive tasks
- Helps developers write code faster
- Enhances customer support

---

## Challenges

- Incorrect information (Hallucinations)
- Data privacy concerns
- Bias in AI models
- Security risks
- Ethical issues

---

# 8. DevOps + Docker + Cloud + AI Integration

Modern software development uses all these technologies together.

```
Developer Writes Code
          ↓
        Git
          ↓
      CI/CD Pipeline
          ↓
       Docker Image
          ↓
   Kubernetes Deployment
          ↓
     Cloud Platform
          ↓
   Monitoring & Logging
          ↓
Generative AI Assistance
```

This workflow helps organizations:

- Develop software faster
- Deploy applications automatically
- Scale applications easily
- Monitor application performance
- Improve productivity using AI

---

# Key Learning Outcomes

After completing Week 7, I understood:

- What DevOps is and why it is important
- DevOps lifecycle
- Docker architecture and workflow
- Docker commands
- Cloud Computing concepts
- Cloud service models
- Cloud deployment models
- CI/CD process
- Difference between Virtual Machines and Containers
- Kubernetes basics
- Fundamentals of Generative AI
- Integration of DevOps, Docker, Cloud, and AI

---

# Technologies Studied

- Git
- GitHub
- DevOps
- Docker
- Kubernetes (Basics)
- Cloud Computing
- Amazon Web Services (AWS)
- Microsoft Azure
- Google Cloud Platform (GCP)
- CI/CD
- Generative AI

---

# Conclusion

Week 7 introduced the core concepts used in modern software development. I learned how DevOps improves collaboration, Docker simplifies application deployment, Cloud Computing provides scalable infrastructure, Kubernetes manages containers, CI/CD automates software delivery, and Generative AI enhances development with intelligent assistance.

These technologies form the foundation of modern cloud-native application development and are widely used in the software industry.

---

# Author

**Md Hasibu Rahman**

**Repository:**  
https://github.com/Rahman-h-md/Java-FSE-Masterclass