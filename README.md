🚀 HireHub – Job Portal Web Application

HireHub is a role-based Job Portal web application designed to simulate how real-world hiring platforms work.
It connects Job Seekers and Recruiters through a secure, session-based system where jobs can be posted, applied for, and managed efficiently.

This project was built end-to-end, covering frontend, backend, database design, authentication, and deployment, while handling real production-level challenges.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

🌍 Live Application

🔗 Frontend (Netlify)
👉 https://hirehub007.netlify.app

🔗 Backend (Render)
(Spring Boot application with session handling)

🔗 Database
MySQL hosted on Clever Cloud

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

🧩 Problem This Project Solves

Most beginner job portals stop at basic CRUD operations.
HireHub goes further by addressing:

* Secure session-based authentication (without JWT)

* Role-based access control

* Resume storage inside the database (not file paths)

* Handling delete operations with foreign key dependencies

* Cross-origin session management in production

* Cloud deployment with limited free-tier resources

This makes HireHub closer to real enterprise backend systems.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

👥 User Roles & Functionalities
👨‍💼 Recruiter Module

Recruiters are authenticated users who can:

* Create and maintain a recruiter profile

* Post job openings

* Edit and delete posted jobs

* View applicants per job

* Accept or reject applications

* View job seeker resumes directly in browser (PDF)

Job deletion correctly handles dependent application records to avoid database constraint errors.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

👨‍🎓 Job Seeker Module

Job seekers can:

* Register and login securely

* Create and update personal profiles

* Upload resume (stored as binary data in DB)

* Browse available job listings

* View recruiter details

* Apply for jobs

* Track previously applied jobs

Resume files are stored as LONGBLOB in MySQL and rendered inline for viewing.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

🔐 Authentication & Security Design

HireHub uses Spring Security with session-based authentication, similar to many traditional enterprise applications.

Key security decisions:

* Session-based login (no JWT)

* HTTP-only secure cookies

* SameSite=None to allow cross-domain frontend/backend

* Role-based endpoint access

* Explicit CORS configuration for production

This approach ensures:

* Better control over session lifecycle

* Simpler frontend (no token storage)

* Secure cookie-based authentication

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

🛠️ Technology Overview

* The backend is built using Java and Spring Boot, following layered architecture with controllers, services, repositories, and entities.
* The frontend is built using pure HTML, CSS, and JavaScript, focusing on clarity and role-based navigation.
MySQL is used as the relational database with JPA/Hibernate handling ORM and relationships.

* The entire application is deployed using modern cloud platforms while respecting free-tier limitations.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

📄 Resume Management (Important Highlight)

Unlike many projects that store resume file paths:

* Resumes are uploaded as PDF

* Stored directly in MySQL as LONGBLOB

* Served using application/pdf

* Displayed inline in browser (no forced download)

* Securely accessible only to authorized recruiters

This design avoids filesystem dependency issues in cloud environments.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

🧠 Engineering Challenges Solved

Some real-world problems handled in this project:

  *	❌ Foreign key constraint errors during job deletion
	✅ Solved by deleting dependent application records first

  *	❌ Session loss after deployment
	✅ Fixed using proper cookie, CORS, and SameSite configuration

  *	❌ Resume upload breaking profile updates
	✅ Multipart handling redesigned to allow optional file updates

  *	❌ Localhost working but production failing
	✅ Debugged and fixed deployment-specific issues

These challenges significantly improved my backend debugging skills.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

🚀 Deployment Architecture

Frontend: Netlify (static hosting with redirects)

Backend: Render (Dockerized Spring Boot app)

Database: MySQL on Clever Cloud

Session Monitoring: Health endpoint for uptime checks

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

📈 Future Enhancements

* Email notifications.

* Admin role.

* Better UI animations.

* Search optimization.

--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------

⭐ Final Note

HireHub is not just a CRUD project.
It reflects real backend thinking, deployment awareness, and production debugging experience.

