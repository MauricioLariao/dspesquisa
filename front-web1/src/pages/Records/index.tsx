
import React, { useEffect, useState } from 'react';
import axios from 'axios'; //faz a pont para requisicao http(endpoint)
import './styles.css';
import { RecordsResponse } from './types';
import { formatDate } from './helpers';
import Pagination from './Pagination';
import Filters from '../../components/Filters';

const BASE_URL = 'http://localhost:8080' //desenv
//const BASE_URL = 'https://dspesquisa-mau.herokuapp.com';

 //logica para fazer a integracao com a api do backend
const Records = () => {
   //CRIAR O ESTADO INTERNO
   const [recordResponse, setRecordResponse] = useState<RecordsResponse>(); 
   const [activePage, setActivePage] = useState(0);
    
    //---ciclo de vida de um componente
    useEffect (() => {
        axios.get(`${BASE_URL}/records?linesPerPage=12&page=${activePage}`)
            .then(response => setRecordResponse(response.data));

    }, [activePage]);

    //funcao para setar a pagina ativa
    const handlePageChange = (index: number) => {
        setActivePage(index);
    }
    
    return (
        <div className="page-container">
            <Filters link="/charts" linkText="VER GÁFICOS" />
            <table className="records-table" cellPadding="0" cellSpacing="0">
                <thead>
                    <tr>
                        <th>INSTANTE</th>
                        <th>NOME</th>
                        <th>IDADE</th>
                        <th>PLATAFORMA</th>
                        <th>GÊNERO</th>
                        <th>TÍTULO DO GAME</th>
                    </tr>
                </thead>
                <tbody>
                    {recordResponse?.content.map(record => (
                        <tr key={record.id}>
                        <td>{formatDate(record.moment)}</td>
                        <td>{record.name}</td>
                        <td>{record.age}</td>
                        <td className="text-secondary">{record.gamePlatform}</td>
                        <td>{record.genreName}</td>
                        <td className="text-primary">{record.gameTitle}</td>
                        </tr>
                    ))}
                    
                </tbody>
            </table>
            <Pagination
                activePage={activePage}
                goToPage={handlePageChange}
                totalPages ={recordResponse?.totalPages}
             />
        </div>
    );
}

export default Records;
