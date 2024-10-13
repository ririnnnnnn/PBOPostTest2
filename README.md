# Penjualan Ticket Wahana Wonderland
Nama: Ririn Yuliani Azahra Zardan
NIM: 2309116065
Prodi: Sistem Informasi B'23

# Deskripsi Utama
Selamat datang di Wonderland! Program ini adalah sebuah program manajemen sistem yang penjualan tiket sederhana yang dibuat menggunakan bahasa pemrograman Java.  Di mana pengguna dapat berperan sebagai admin atau pembeli tiket. Program ini dirancang untuk mengelola data tiket secara fleksibel dengan memperhitungkan skenario di mana tiket mungkin perlu dikelola oleh admin (menambah, memperbarui, atau menghapus) serta transaksi pembelian yang dilakukan oleh pembeli.

# Struktur Project
- Package <br>
  Package ini berisi model atau representasi dari entitas tiket, termasuk tipe tiket yang berbeda.
  ![image](https://github.com/user-attachments/assets/231545cd-9125-4c81-9e75-0025583a6913)

  
- Class <br>
  Package ini berisi logika untuk pengelolaan dan penjualan tiket, termasuk kelas utama yang menjalankan program.
  ![image](https://github.com/user-attachments/assets/0629bbd7-df54-4c4b-a314-9a24bf9dd19c)

# Cara Kerja Program
1. Admin: Dapat mengakses menu admin untuk:
   Menambah tiket baru dengan memasukkan informasi ID, nama, dan harga.
   Menampilkan semua tiket yang tersedia.
   Memperbarui tiket dengan memasukkan ID tiket yang ingin diubah.
   Menghapus tiket dengan mencari ID tiket yang sesuai.
2. Pembeli: Dapat mengakses menu pembeli untuk:
   Membeli tiket dengan memasukkan ID tiket yang ingin dibeli dan mengonfirmasi pembelian.

# Alur Program

1. Menu Read
   <p>Menambah tiket baru dengan memasukkan informasi ID, nama, dan harga.</p>
2. Menu Create
   <p>Menu untuk membuat peminjaman ruang baru dengan memasukkan informasi seperti kode ruang, tanggal peminjaman, keperluan, dan status. Setelah itu, peminjaman baru ditambahkan ke daftar peminjaman.<p>
3. Menu Update
   <p>Menu untuk mengubah status peminjaman ruang yang sudah ada. User akan diminta untuk memasukkan kode ruang yang ingin diupdate dan status baru</p>
4. Menu Delete
   <p>Menu untuk menghapus peminjaman ruang berdasarkan kode ruang yang dimasukkan oleh user. Jika peminjaman dengan kode tersebut ditemukan, maka akan dihapus dari daftar</p>
6. Keluar
   <p>Menu untuk keluar dari program. Setelah memilih opsi ini, program akan berhenti.</p>

<br>

# Penjelasan SourceCode
- Class Ticket <br>
  Kelas ini merupakan kelas dasar yang mewakili tiket secara umum. Kelas ini memiliki atribut id, name, dan price, serta menyediakan metode untuk menampilkan informasi tiket dan metode getter serta   
  setter untuk mengakses dan memodifikasi atribut.
  ![image](https://github.com/user-attachments/assets/3f6f2093-3bc4-4415-b076-5225126580b9)
  ![image](https://github.com/user-attachments/assets/194df0bb-06cc-44d9-b4d9-a3da6492a5bf)

- Class StandardTicket dan VIPTicket
  Kelas-kelas ini merupakan turunan dari Ticket yang merepresentasikan jenis tiket tertentu, yaitu standar dan VIP. Mereka mengoverride metode displayTicketInfo untuk menunjukkan tipe tiket (standar     atau VIP) saat menampilkan informasi tiket.
  ![image](https://github.com/user-attachments/assets/fa6a3305-c6b9-48ac-bd7d-c78cd58e2d9d)
  ![image](https://github.com/user-attachments/assets/938a796f-9349-4ea7-8772-1d60dc2f7f0b)

- TicketInterface
  Sebuah antarmuka yang mendefinisikan metode umum yang harus diimplementasikan oleh kelas yang mengelola penjualan tiket, seperti addTicket(), displayAllTickets(), updateTicket(),         
  deleteTicket(), dan buyTicket().
  ![image](https://github.com/user-attachments/assets/70754978-4e8e-4ac4-b041-6172a0f02ead)

- Class TicketSales
  Kelas ini mengimplementasikan antarmuka TicketInterface dan berfungsi sebagai manajer tiket. Di dalamnya, terdapat metode untuk menambah, menampilkan, memperbarui, menghapus, dan membeli tiket.        Kelas   ini juga menggunakan ArrayList untuk menyimpan koleksi tiket.
  ![image](https://github.com/user-attachments/assets/5f87aa11-a208-433b-b4fc-555ca19c5bd8)
  ![image](https://github.com/user-attachments/assets/f971e47b-9ba1-49f6-9aa3-feb784eb4750)
  ![image](https://github.com/user-attachments/assets/2a461f82-b509-4f0a-83ec-7669ce898da9)
  ![image](https://github.com/user-attachments/assets/2f244e5b-f151-49f1-98e5-53e044d87f66)


- Class OnlineTicketSales
  Kelas ini merupakan turunan dari TicketSales yang dirancang untuk menangani penjualan tiket online. Kelas ini memiliki koleksi tiket online (onlineTickets) dan metode khusus untuk menambah dan       
  menampilkan tiket online. Metode buyTicket dioverride untuk mengelola pembelian tiket online secara spesifik.
  ![image](https://github.com/user-attachments/assets/cbe9ca42-42ce-46d5-91b3-b087bd802001)
  ![image](https://github.com/user-attachments/assets/ed9e675e-a21a-4e2f-851f-9c75916a3fed)

- Class Main
  Kelas utama yang menjalankan program dan menampilkan menu utama. Program terus berulang menampilkan menu utama hingga pengguna memilih untuk keluar. Di dalam menu admin, pengguna bisa mengelola data   tiket, sedangkan di menu pembeli, pengguna bisa melakukan transaksi pembelian tiket.
  ![image](https://github.com/user-attachments/assets/5ef626c6-4af3-40ee-a5d5-76bb429cf1fd)
  ![image](https://github.com/user-attachments/assets/270a0cd7-1f80-4092-9b26-cf96c1d1d6b2)
  ![image](https://github.com/user-attachments/assets/8d742fb5-ae66-4670-ae8b-9859edbee7ed)


# Penjelasan Output
1. Menu Utama <br>
   <br>
   <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/afc9e7d6-2ba1-4e61-b59d-54fbf2f94301">
  
2. Menu Read <br>
   - Jika didalam ArrayList tidak terdapat data, maka outputnya adalah sebagai berikut. <br>
     <br>
     <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/ad73448c-9371-450e-acf3-6f5991a5c094">
   - Jika didalam ArrayList terdapat data, maka outputnya adalah sebagai berikut. <br>
     <br>
     <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/9759d0a2-d4e3-4194-8f20-eb238357c342">

3. Menu Create <br>
    <br>
    <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/94922e33-193c-4275-b22e-efc0ae1333a0">
   
4. Menu Update <br>
    - Jika kode kelas ditemukan maka Update akan sukses. <br>
      <br>  
      <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/d43fc4e1-b320-4a4e-bf8f-ccf23f3eb7a9">
      <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/cd1bdcac-6026-46fe-ab6b-dc66e4f59095">
    - Jika kode kelas tidak ditemukan maka outputnya adalah sebagai berikut. <br>
      <br>
      <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/39a44f78-7b8f-47fc-9e70-07b9ccf7da8f">

5. Menu Delete <br>
    - Jika kode kelas ditemukan maka kode kelas akan berhasil dihapus. <br>
      <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/c785dc0a-97e2-47ce-a368-c18284bb7d10">
      <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/b172f547-379a-4cfc-91bb-b3ecd70acf72">
    - Jika kode kelas ditemukan, maka outputnya adalah sebagai berikut. <br>
      <br>
      <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/46e18de1-a72f-4073-bba3-47478d677509">

6. Keluar (End) <br>
    <p>Berikut adalah tampilan jika user telah memilih keluar dari program.</p><br>
    <img width="500" alt="image" src="https://github.com/noviantisafitri/pbo-post-test-2/assets/121856489/9bb607c4-25bc-4a62-9355-e78f7eea8fb8">
