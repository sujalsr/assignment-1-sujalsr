public class Person
    {

        private String fname;
        private String lname;
        private String phone;
        private String email;

        public String getFname() {
            return fname;
        }

        public void setFname(String fname) {
            this.fname = fname;
        }

        public String getLname() {
            return lname;
        }

        public void setLname(String lname) {
            this.lname = lname;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "fname='" + fname + '\'' +
                    ", lname='" + lname + '\'' +
                    ", phone='" + phone + '\'' +
                    ", email='" + email + '\'' +
                    '}';
        }
    }

