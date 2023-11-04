Software Requirements Specification (SRS) for Exam App
1. Introduction
•	The Exam App project aims to develop a mobile application and backend system for conducting online exams and assessments, enabling users to take exams, view results, and manage their accounts.
2. Project Overview
•	The Exam App project is sponsored by BEU to provide a platform for educational institutions and individuals to create, administer, and take exams.
3. Scope
•	The Exam App will include the following key features:
o	User registration and authentication
o	Exam creation and management
o	Exam-taking functionality
o	Real-time assessment and scoring
o	User profile management
o	Secure storage and retrieval of exam data
o	Integration with third-party learning management systems (LMS)
•	Constraints and assumptions:
o	The app will support Android platforms.
o	Security measures will ensure the integrity of exam data.
o	Integration with third-party LMS may be required.
4. Functional Requirements
4.1 Mobile App
•	User Registration:
o	Users can create accounts with a username, password, and contact information.
o	Users can log in and reset their passwords.
•	Exam Creation and Management:
o	Instructors and administrators can create, edit, and manage exams.
•	Exam-Taking Functionality:
o	Users can access exams assigned to them.
o	Users can take exams with various question types (multiple choice, essay, etc.).
o	Users can navigate between questions and submit their responses.
•	Real-Time Assessment and Scoring:
o	Users receive instant feedback on multiple-choice questions.
o	Essay questions are evaluated and scored by instructors.
•	User Profile Management:
o	Users can update their profile information.
•	Secure Storage and Retrieval:
o	Ensure secure storage and retrieval of exam data to protect against data breaches.
•	Integration with Third-Party LMS:
o	Allow integration with third-party learning management systems for data exchange.
4.2 Backend
•	Database:
o	Use a database to store user profiles, exam content, and results.
•	API Endpoints:
o	Define RESTful API endpoints for user registration, exam creation, exam-taking, and user profiles.
•	Exam Scoring and Assessment:
o	Implement mechanisms for real-time scoring of multiple-choice questions and manual assessment of essay questions.
•	Security:
o	Implement measures for data protection and access control.
•	Integration with Third-Party LMS:
o	Enable integration with third-party learning management systems using standard protocols.
5. Non-Functional Requirements
•	Performance:
o	Response time: Within 2 seconds for most user interactions.
o	Availability: 99.9% uptime.
•	Usability:
o	Intuitive user interface and a user-friendly experience.
•	Reliability:
o	Implement failover and backup systems for data redundancy.
•	Compatibility:
o	Support Android devices.
•	Data Backup and Recovery:
o	Regular data backups and a disaster recovery plan.
•	Legal and Compliance:
o	Ensure compliance with data privacy and copyright regulations.
•	Documentation:
o	Provide user manuals and API documentation.
6. System Architecture
•	The system will use a multi-tier architecture, consisting of a mobile app interface, a RESTful API, and a database hosted on Local Computer.
7. Test Requirements
•	Testing will include unit testing, integration testing, and user acceptance testing. Test cases will be documented and executed.
8. Timeline and Milestones
•	The project timeline includes development, testing, and deployment phases with specific milestones.
![image](https://github.com/BakuEngineeringUniversity/prj-exam-app-2023/assets/44253460/a44739e6-bb25-4fc6-8b99-cd6032ec7031)
