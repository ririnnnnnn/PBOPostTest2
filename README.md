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

1. Menu Menambah
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
   Saat program dijalankan akan menampilkan menu utama yang terdiri dari 3 pilihan yaitu:
   ![image](https://github.com/user-attachments/assets/2c48facf-5f16-4a46-b313-5b15fbb671b5)

2. Menu Admin
   Setelah pengguna memilih mode Admin dari menu utama dengan memasukkan angka 1, maka program akan menampilkan Menu Admin yang dapat digunakan oleh administrator untuk mengelola sistem penjualan         tiket. Menu ini berisi beberapa pilihan yang dapat digunakan oleh administrator untuk melakukan tugas-tugas, berikut tampilan dan penjelasan dari masing-masing pilihan di menu admin:
   ![image](https://github.com/user-attachments/assets/5afe70f3-3b4a-4af4-b4f7-8a2a434f7e4c)

3. Menu Menambah <br>
   Pilihan ini digunakan oleh admin untuk menambahkan tiket baru ke sistem. Setelah memilih opsi ini, admin akan diminta untuk memasukkan detail tiket, seperti id ticket, nama ticket, dan harga tiket
   ![image](https://github.com/user-attachments/assets/ebc9679f-cea4-466d-bf04-c85b56f192dc)

4. Menu Tampilkan
   Admin dapat memilih opsi ini untuk melihat daftar semua tiket yang sudah ditambahkan ke dalam program. Program akan menampilkan informasi setiap tiket, termasuk nama tiket, harga tiket, dan id         tiket.
   ![image](https://github.com/user-attachments/assets/6c28dc88-8926-4b85-ad3b-bd1d971ab44a)

5. Menu Memperbarui <br>
   Opsi ini memungkinkan admin untuk memperbarui informasi dari tiket yang sudah ada. Admin akan diminta untuk memilih tiket yang ingin diperbarui berdasarkan id tiket, dan kemudian dapat memperbarui     detail seperti harga atau nama tiket.
   ![image](https://github.com/user-attachments/assets/6fae8202-6f19-4ce4-beb2-c5a0637c62c3)

6. Menu Menghapus
   ![image](https://github.com/user-attachments/assets/d6920d7d-fb1e-477a-ad3b-5ba1b47ed68b)
   Admin dapat menghapus tiket dari daftar, dengan memilih opsi ke 4 ini. Program akan meminta admin memasukkan id tiket yang ingin dihapus, dan tiket tersebut akan dihapus dari program.

7. Menu Pembeli
   Jika pengguna memilih mode Pembeli dari menu utama dengan memasukkan angka 2, program akan menampilkan Menu Pembeli dengan dua opsi yang dapat dilakukan oleh pembeli, yaitu membeli tiket dan       
   kembali ke menu utama. Berikut adalah tampilan dan penjelasan dari setiap pilihan yang ada di dalam Menu Pembeli:
   ![image](https://github.com/user-attachments/assets/49de36a5-3a55-472c-9611-c13709a0f55e)

8. Menu Membeli
   Menu ini digunakan oleh pembeli untuk melakukan transaksi pembelian tiket. Setelah memilih opsi ini, program akan memandu mereka melalui beberapa langkah untuk menyelesaikan pembelian.
   ![image](https://github.com/user-attachments/assets/673169fa-d41e-4516-8c21-12f01567ba77)

9. Menu Keluar
   Ketika pengguna memilih opsi 3 dari Menu Utama, program akan menampilkan pesan perpisahan dan menghentikan eksekusi. Berikut adalah tampilan yang muncul saat pengguna memilih untuk keluar:
   ![image](https://github.com/user-attachments/assets/9e8a1766-4a93-46a2-8853-ac1c96bc7c4a)



