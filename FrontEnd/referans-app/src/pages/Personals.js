import React, { useState,useEffect } from 'react'
import { Icon, Label, Menu, Table } from 'semantic-ui-react'
import PersonalService from '../services/personalService'

export default function Personals() {

    const [personals, setPersonals] = useState([])

    useEffect(()=>{
        let personalService = new PersonalService()
        personalService.getPersonals().then(result=>setPersonals(result.data.data))

    })

    return (
        <div>
              <Table celled>
    <Table.Header>
      <Table.Row>
        <Table.HeaderCell>Email Adresi</Table.HeaderCell>
        <Table.HeaderCell>İsim</Table.HeaderCell>
        <Table.HeaderCell>Soyisim</Table.HeaderCell>
      </Table.Row>
    </Table.Header>

    <Table.Body>
        {
            personals.map((personel)=>(
                <Table.Row key={personel.id}>
                <Table.Cell>{personel.email}</Table.Cell>
                <Table.Cell>{personel.userName}</Table.Cell>
                <Table.Cell>{personel.lastName}</Table.Cell>
              </Table.Row>
            ))
        }
 
    </Table.Body>

    <Table.Footer>
      <Table.Row>
        <Table.HeaderCell colSpan='3'>
          <Menu floated='right' pagination>
            <Menu.Item as='a' icon>
              <Icon name='chevron left' />
            </Menu.Item>
            <Menu.Item as='a'>1</Menu.Item>
            <Menu.Item as='a'>2</Menu.Item>
            <Menu.Item as='a'>3</Menu.Item>
            <Menu.Item as='a'>4</Menu.Item>
            <Menu.Item as='a' icon>
              <Icon name='chevron right' />
            </Menu.Item>
          </Menu>
        </Table.HeaderCell>
      </Table.Row>
    </Table.Footer>
  </Table>
        </div>
    )
}
