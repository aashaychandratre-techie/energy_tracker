# 🏠 Home Energy Tracker – Spring Boot Microservices

A **highly scalable microservices-based home energy tracking system** built using **Spring Boot, Kafka, and Time-Series databases**.  
The system ingests real-time energy data from millions of devices, stores it efficiently, triggers alerts, and generates **AI-powered energy-saving insights**.

---

## 🚀 Features

- 📊 Track **hourly & daily energy usage** per device and room
- ⚡ Handle **high-throughput ingestion** using Kafka
- 📈 Store energy data in **time-series databases**
- 🔔 Threshold-based **alerting system**
- 🤖 AI-powered **energy-saving recommendations**
- 🧩 Modular **microservices architecture**
- 📦 Cloud & container ready

---

## 🧠 Energy Fundamentals

| Term | Description |
|----|----|
| Power (W) | Energy consumed per second |
| Energy (kWh) | Power used over one hour |
| Cost | Energy (kWh) × price per kWh |

**Example:**  
A 1.2 kW device used for 30 minutes → `0.6 kWh`

---

## 📊 System Load Estimation

| Metric | Value |
|------|------|
| Monthly active users | 10k |
| Devices per user | 5 |
| Total devices | 50 - 100k |
| Readings per device | 1/min |
| Readings per day | ~10-20M |
| Writes per second | ~8000 |
| Storage per month | ~4 TB (compressed) |

---


## 🧩 Microservices

### 🔹 API Gateway
- Single entry point
- Routes requests to services
- Lightweight & stateless

### 🔹 Ingestion Service
- Receives device readings
- Produces messages to Kafka
- Handles load buffering

### 🔹 Device Service
- Device registration & metadata
- Database: MySQL

### 🔹 User Service
- User profiles & preferences
- Energy thresholds
- Database: MySQL

### 🔹 Usage Service
- Consumes Kafka messages
- Stores energy data
- Aggregates usage
- Database: Time-Series DB (TimescaleDB / InfluxDB)

### 🔹 Alert Service
- Listens for threshold breaches
- Sends notifications
- Maintains audit logs
- Database: MySQL

### 🔹 Insight Service
- Analyzes usage patterns
- Generates AI-powered tips
- Personalized recommendations

---


## ⚙ Tech Stack

- **Backend:** Spring Boot, Spring Cloud
- **Messaging:** Apache Kafka
- **Databases:**
  - MySQL (User, Device, Alerts)
  - Time-Series DB (Usage data)
- **Containerization:** Docker
- **Orchestration:** Kubernetes (planned)
- **AI Integration:** Future enhancement

---

## ▶️ Running the Project (Local)

```bash
# Start Kafka
docker-compose up -d

# Start services
cd api-gateway && mvn spring-boot:run
cd ingestion-service && mvn spring-boot:run
cd usage-service && mvn spring-boot:run
cd alert-service && mvn spring-boot:run




