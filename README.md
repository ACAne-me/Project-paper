
# 🛒 Online Pharmacy Based on Spring Boot

## 📦 Backend Environment
- **Database**: MySQL 8
- **Setup Steps**:
  1. Create a database named `springboothc349102`.
  2. Download the SQL file from: `shopping/database/springboothc349102.sql`.
  3. Import `springboothc349102.sql` into your database.
  4. Run the backend application:  
     `shopping/src/main/java/com/SpringbootSchemaApplication.java`.

---

## 🎨 Frontend Environment
- **Node.js**: v14.21.3
- **npm**: v6.14.18

### Running the Projects:
- **Admin Panel (Back Control System)**  
  Navigate to `Project-paper-main/admin/admin` and run:
  ```bash
  npm install
  npm run serve
  ```

- **User Frontend (Front System)**  
  Also in `Project-paper-main/admin/admin`, run:
  ```bash
  npm install
  npm run serve
  ```

---

## 🔑 Default Accounts
- **Admin Panel**:  
  - Username: `admin`  
  - Password: `admin`

- **Frontend (User Site)**:  
  - **First time users** should click "Login/Register" to sign in.  
  - Example account:  
    - Username: `用户名1`  
    - Password: `123456`

---

## 📝 Notes
- Make sure your MySQL service is running before starting the backend.
- If port conflicts occur, adjust `application.yml` or `vue.config.js` as needed.
