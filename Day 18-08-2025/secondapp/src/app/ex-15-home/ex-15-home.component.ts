import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-ex-15-home',
  imports: [CommonModule],
  standalone: true,
  templateUrl: './ex-15-home.component.html',
  styleUrl: './ex-15-home.component.css'
})
export class Ex15HomeComponent {
  books = [
    { title: 'Book Title 1', description: 'This is a brief description for Book 1.', image: 'https://images.theconversation.com/files/45159/original/rptgtpxd-1396254731.jpg?ixlib=rb-4.1.0&q=45&auto=format&w=754&fit=clip' },
    { title: 'Book Title 2', description: 'This is a brief description for Book 2.', image: 'https://images.theconversation.com/files/45159/original/rptgtpxd-1396254731.jpg?ixlib=rb-4.1.0&q=45&auto=format&w=754&fit=clip' },
    { title: 'Book Title 3', description: 'This is a brief description for Book 3.', image: 'https://images.theconversation.com/files/45159/original/rptgtpxd-1396254731.jpg?ixlib=rb-4.1.0&q=45&auto=format&w=754&fit=clip' },
    { title: 'Book Title 4', description: 'This is a brief description for Book 4.', image: 'https://images.theconversation.com/files/45159/original/rptgtpxd-1396254731.jpg?ixlib=rb-4.1.0&q=45&auto=format&w=754&fit=clip' },
    { title: 'Book Title 5', description: 'This is a brief description for Book 5.', image: 'https://images.theconversation.com/files/45159/original/rptgtpxd-1396254731.jpg?ixlib=rb-4.1.0&q=45&auto=format&w=754&fit=clip' },
    { title: 'Book Title 6', description: 'This is a brief description for Book 6.', image: 'https://images.theconversation.com/files/45159/original/rptgtpxd-1396254731.jpg?ixlib=rb-4.1.0&q=45&auto=format&w=754&fit=clip' },
    { title: 'Book Title 7', description: 'This is a brief description for Book 7.', image: 'https://images.theconversation.com/files/45159/original/rptgtpxd-1396254731.jpg?ixlib=rb-4.1.0&q=45&auto=format&w=754&fit=clip' },
    { title: 'Book Title 8', description: 'This is a brief description for Book 8.', image: 'https://images.theconversation.com/files/45159/original/rptgtpxd-1396254731.jpg?ixlib=rb-4.1.0&q=45&auto=format&w=754&fit=clip' },
    { title: 'Book Title 9', description: 'This is a brief description for Book 9.', image: 'https://images.theconversation.com/files/45159/original/rptgtpxd-1396254731.jpg?ixlib=rb-4.1.0&q=45&auto=format&w=754&fit=clip' },
    { title: 'Book Title 10', description: 'This is a brief description for Book 10.', image: 'https://images.theconversation.com/files/45159/original/rptgtpxd-1396254731.jpg?ixlib=rb-4.1.0&q=45&auto=format&w=754&fit=clip' },
    { title: 'Book Title 11', description: 'This is a brief description for Book 11.', image: 'https://images.theconversation.com/files/45159/original/rptgtpxd-1396254731.jpg?ixlib=rb-4.1.0&q=45&auto=format&w=754&fit=clip' },
    { title: 'Book Title 12', description: 'This is a brief description for Book 12.', image: 'https://images.theconversation.com/files/45159/original/rptgtpxd-1396254731.jpg?ixlib=rb-4.1.0&q=45&auto=format&w=754&fit=clip' },
    { title: 'Book Title 13', description: 'This is a brief description for Book 13.', image: 'https://images.theconversation.com/files/45159/original/rptgtpxd-1396254731.jpg?ixlib=rb-4.1.0&q=45&auto=format&w=754&fit=clip' },
    { title: 'Book Title 14', description: 'This is a brief description for Book 14.', image: 'https://images.theconversation.com/files/45159/original/rptgtpxd-1396254731.jpg?ixlib=rb-4.1.0&q=45&auto=format&w=754&fit=clip' },
    { title: 'Book Title 15', description: 'This is a brief description for Book 15.', image: 'https://images.theconversation.com/files/45159/original/rptgtpxd-1396254731.jpg?ixlib=rb-4.1.0&q=45&auto=format&w=754&fit=clip' },
    { title: 'Book Title 16', description: 'This is a brief description for Book 16.', image: 'https://images.theconversation.com/files/45159/original/rptgtpxd-1396254731.jpg?ixlib=rb-4.1.0&q=45&auto=format&w=754&fit=clip' },
    { title: 'Book Title 17', description: 'This is a brief description for Book 17.', image: 'https://images.theconversation.com/files/45159/original/rptgtpxd-1396254731.jpg?ixlib=rb-4.1.0&q=45&auto=format&w=754&fit=clip' },
    { title: 'Book Title 18', description: 'This is a brief description for Book 18.', image: 'https://images.theconversation.com/files/45159/original/rptgtpxd-1396254731.jpg?ixlib=rb-4.1.0&q=45&auto=format&w=754&fit=clip' },
    { title: 'Book Title 19', description: 'This is a brief description for Book 19.', image: 'https://images.theconversation.com/files/45159/original/rptgtpxd-1396254731.jpg?ixlib=rb-4.1.0&q=45&auto=format&w=754&fit=clip' },
    { title: 'Book Title 20', description: 'This is a brief description for Book 20.', image: 'https://images.theconversation.com/files/45159/original/rptgtpxd-1396254731.jpg?ixlib=rb-4.1.0&q=45&auto=format&w=754&fit=clip' }
  ];

}
