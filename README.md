# TestEnigma
Test Kerja Enigma

- pertama download atau clone dari github
- setting mysql seperti dibawah ini 
  
  mysql -u root
  use mysql;
  desc user;
  select user,host from user;
  update user set host='%' where user='root' and host='127.0.0.1';
  select user,host from user;
  bind my.ini to (your current IP) example>> bind my.ini to 10.10.15.130
  mysql -u root -p -h (your current IP) example>> mysql -u root -h 10.10.15.130
  
- kedua jalankan docker-compose up
- lalu uji di browser dengan alamat "http://localhost:7000/(dengan api sesuai diaplikasi)" 

# untuk melihat swagger
- ketikkan dibrowser : "localhost:7000/swagger-ui.html"
