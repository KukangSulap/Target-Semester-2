//
//  ViewController.swift
//  DuolingoOfficialApp
//
//  Created by Dora The Explorer on 12/4/17.
//  Copyright © 2017 Dora The Explorer. All rights reserved.
//

import UIKit
import WebKit

class ViewController: UIViewController {
    @IBOutlet weak var webViewPreview: WKWebView!
    
    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view, typically from a nib.
        
        let url = URL(string: "https://www.duolingo.com/")
        let request = URLRequest(url: url!)
        
        webViewPreview.load(request)
    }
    
    
    override func didReceiveMemoryWarning() {
        super.didReceiveMemoryWarning()
        // Dispose of any resources that can be recreated.
    }
    
    
}

