//criar tipos para tratar os registros vindo do back
export type RecordsResponse = {
    content: RecordItem[]; //criando o tipo de registro
    totalPages: number;
}

export type RecordItem = {
    id: number,
    moment: string,
    name: string,
    age: number,
    gameTitle: string,
    gamePlatform: Platform,
    genreName: string
}

export type Platform = 'XBOX' | 'PC' | 'PLAYSTATION'